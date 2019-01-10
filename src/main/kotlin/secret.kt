import com.bettercloud.vault.Vault
import com.bettercloud.vault.VaultConfig

abstract class SecretManager {
    abstract fun retrive(key: String): String
}

class VaultSecretManager : SecretManager {

    val vault: Lazy<Vault> = lazy { Vault(VaultConfig().address(application.environment.config).build()) }


}