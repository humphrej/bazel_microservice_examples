java_library(
    name = "log4j_api",
    exports = [
        "//external:jar/mvnorg/apache/logging/log4j/log4j_api"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "log4j_to_slf4j",
    exports = [
        "//external:jar/mvnorg/apache/logging/log4j/log4j_to_slf4j"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/slf4j:slf4j_api",
        ":log4j_api"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


