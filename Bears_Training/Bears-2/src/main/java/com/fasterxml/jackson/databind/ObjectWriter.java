package com.fasterxml.jackson.databind;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Builder object that can be used for per-serialization configuration of
 * serialization parameters, such as JSON View and root type to use.
 * (and thus fully thread-safe with no external synchronization);
 * new instances are constructed for different configurations.
 * Instances are initially constructed by {@link ObjectMapper} and can be
 * reused in completely thread-safe manner with no explicit synchronization
 */
public class ObjectWriter
    implements Versioned,
        java.io.Serializable // since 2.1
{
    private static final long serialVersionUID = 1; // since 2.5

    /**
     * We need to keep track of explicit disabling of pretty printing;
     * easiest to do by a token value.
     */
    protected final static PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();

    /*
    /**********************************************************
    /* Immutable configuration from ObjectMapper
    /**********************************************************
     */

    /**
     * General serialization configuration settings
     */
    protected final SerializationConfig _config;

    protected final DefaultSerializerProvider _serializerProvider;

    protected final SerializerFactory _serializerFactory;

    /**
     * Factory used for constructing {@link JsonGenerator}s
     */
    protected final JsonFactory _generatorFactory;

    /*
    /**********************************************************
    /* Configuration that can be changed via mutant factories
    /**********************************************************
     */

    /**
     * Container for settings that need to be passed to {@link JsonGenerator}
     * constructed for serializing values.
     *
     * @since 2.5
     */
    protected final GeneratorSettings _generatorSettings;

    /**
     * We may pre-fetch serializer if root type
     * is known (has been explicitly declared), and if so, reuse it afterwards.
     * This allows avoiding further serializer lookups and increases
     * performance a bit on cases where readers are reused.
     *
     * @since 2.5
     */
    protected final Prefetch _prefetch;
    
    /*
    /**********************************************************
    /* Life-cycle, constructors
    /**********************************************************
     */

    /**
     * Constructor used by {@link ObjectMapper} for initial instantiation
     */
    protected ObjectWriter(ObjectMapper mapper, SerializationConfig config,
            JavaType rootType, PrettyPrinter pp)
    {
        _config = config;
        _serializerProvider = mapper._serializerProvider;
        _serializerFactory = mapper._serializerFactory;
        _generatorFactory = mapper._jsonFactory;
        _generatorSettings = (pp == null) ? GeneratorSettings.empty
                : new GeneratorSettings(pp, null, null, null);

        // 29-Apr-2014, tatu: There is no "untyped serializer", so:
        if (rootType == null || rootType.hasRawClass(Object.class)) {
            _prefetch = Prefetch.empty;
        } else {
            rootType = rootType.withStaticTyping();
            _prefetch = Prefetch.empty.forRootType(this, rootType);
        }
    }

    /**
     * Alternative constructor for initial instantiation by {@link ObjectMapper}
     */
    protected ObjectWriter(ObjectMapper mapper, SerializationConfig config)
    {
        _config = config;
        _serializerProvider = mapper._serializerProvider;
        _serializerFactory = mapper._serializerFactory;
        _generatorFactory = mapper._jsonFactory;

        _generatorSettings = GeneratorSettings.empty;
        _prefetch = Prefetch.empty;
    }

   
    }
}
