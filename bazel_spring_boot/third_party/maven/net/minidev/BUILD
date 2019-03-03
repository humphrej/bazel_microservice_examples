java_library(
    name = "accessors_smart",
    exports = [
        "//external:jar/mvnnet/minidev/accessors_smart"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/ow2/asm:asm"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "json_smart",
    exports = [
        "//external:jar/mvnnet/minidev/json_smart"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":accessors_smart"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


