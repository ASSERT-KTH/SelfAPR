[BugLab_Variable_Misuse]^this.key = old;^58^^^^^56^60^this.key = key;^[CLASS] AbstractKeyValue  [METHOD] setKey [RETURN_TYPE] K   K key [VARIABLES] V  value  K  key  old  boolean  
[BugLab_Variable_Misuse]^return key;^59^^^^^56^60^return old;^[CLASS] AbstractKeyValue  [METHOD] setKey [RETURN_TYPE] K   K key [VARIABLES] V  value  K  key  old  boolean  
[BugLab_Variable_Misuse]^final V old = value;^72^^^^^71^75^final V old = this.value;^[CLASS] AbstractKeyValue  [METHOD] setValue [RETURN_TYPE] V   V value [VARIABLES] V  old  value  K  key  old  boolean  
[BugLab_Variable_Misuse]^this.value = old;^73^^^^^71^75^this.value = value;^[CLASS] AbstractKeyValue  [METHOD] setValue [RETURN_TYPE] V   V value [VARIABLES] V  old  value  K  key  old  boolean  
[BugLab_Variable_Misuse]^return value;^74^^^^^71^75^return old;^[CLASS] AbstractKeyValue  [METHOD] setValue [RETURN_TYPE] V   V value [VARIABLES] V  old  value  K  key  old  boolean  
