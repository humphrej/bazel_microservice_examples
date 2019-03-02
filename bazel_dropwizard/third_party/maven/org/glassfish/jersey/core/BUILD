java_library(
    name = "jersey_client",
    exports = [
        "//external:jar/mvnorg/glassfish/jersey/core/jersey_client"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/glassfish/hk2/external:javax_inject",
        "//third_party/maven/org/glassfish/hk2:hk2_api",
        "//third_party/maven/org/glassfish/hk2:hk2_locator",
        ":jersey_common"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jersey_common",
    exports = [
        "//external:jar/mvnorg/glassfish/jersey/core/jersey_common"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/annotation:javax_annotation_api",
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/glassfish/hk2/external:javax_inject",
        "//third_party/maven/org/glassfish/hk2:hk2_api",
        "//third_party/maven/org/glassfish/hk2:hk2_locator",
        "//third_party/maven/org/glassfish/hk2:osgi_resource_locator",
        "//third_party/maven/org/glassfish/jersey/bundles/repackaged:jersey_guava"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jersey_server",
    exports = [
        "//external:jar/mvnorg/glassfish/jersey/core/jersey_server"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/annotation:javax_annotation_api",
        "//third_party/maven/javax/validation:validation_api",
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/glassfish/hk2/external:javax_inject",
        "//third_party/maven/org/glassfish/hk2:hk2_api",
        "//third_party/maven/org/glassfish/hk2:hk2_locator",
        "//third_party/maven/org/glassfish/jersey/media:jersey_media_jaxb",
        ":jersey_client",
        ":jersey_common"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


