java_library(
    name = "jackson_jaxrs_base",
    exports = [
        "//external:jar/mvncom/fasterxml/jackson/jaxrs/jackson_jaxrs_base"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/core:jackson_core",
        "//third_party/maven/com/fasterxml/jackson/core:jackson_databind"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jackson_jaxrs_json_provider",
    exports = [
        "//external:jar/mvncom/fasterxml/jackson/jaxrs/jackson_jaxrs_json_provider"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/module:jackson_module_jaxb_annotations",
        ":jackson_jaxrs_base"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


