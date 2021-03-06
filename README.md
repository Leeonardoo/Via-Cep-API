[![](https://jitpack.io/v/jeancsanchez/Via-Cep-API.svg)](https://jitpack.io/#jeancsanchez/Via-Cep-API)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/55656de158c14b718ee3a41c7b42025a)](https://app.codacy.com/app/jeancsanchez/Via-Cep-API?utm_source=github.com&utm_medium=referral&utm_content=jeancsanchez/Via-Cep-API&utm_campaign=Badge_Grade_Dashboard)
 

Via CEP API
===================

Uma biblioteca Android para consulta de CEPs. Basicamente ela usa a [API do Via CEP](http://viacep.com.br) :stuck_out_tongue_closed_eyes:


![](https://raw.githubusercontent.com/jeancsanchez/Via-Cep-API/master/viacepapi.gif)


Como utilizar
--------

```kotlin
 ViaCepRequest().buscarCep(60752310,
            onSuccess = { cep: Cep? ->
                // \õ/
            },
            onError = {
                // :(
            })
            
 ViaCepRequest().buscarCepsPorEndereco(
            uf = "CE",
            cidade = "Fortaleza",
            logradouro = "Domingos",
            onSuccess = { ceps ->
                // \õ/
            },
            onError = {
                // :(
            })
```


Download
--------
1- Adicionar o repositrio do Jitpack em seu arquivo build.gradle:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
  ```

2- Adicionar a dependência no build.gradle no módulo do app:

```groovy
dependencies {
    implementation 'com.github.jeancsanchez:Via-Cep-API:{latest version}'
}
```
