java_library(
    name = "hk2_api",
    exports = [
        "//external:jar/mvnorg/glassfish/hk2/hk2_api"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/inject:javax_inject",
        "//third_party/maven/org/glassfish/hk2/external:aopalliance_repackaged",
        ":hk2_utils"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "hk2_locator",
    exports = [
        "//external:jar/mvnorg/glassfish/hk2/hk2_locator"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/glassfish/hk2/external:aopalliance_repackaged",
        "//third_party/maven/org/glassfish/hk2/external:javax_inject",
        "//third_party/maven/org/javassist:javassist",
        ":hk2_api",
        ":hk2_utils"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "hk2_utils",
    exports = [
        "//external:jar/mvnorg/glassfish/hk2/hk2_utils"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/inject:javax_inject"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "osgi_resource_locator",
    exports = [
        "//external:jar/mvnorg/glassfish/hk2/osgi_resource_locator"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


