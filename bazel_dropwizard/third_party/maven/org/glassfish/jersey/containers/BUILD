java_library(
    name = "jersey_container_servlet",
    exports = [
        "//external:jar/mvnorg/glassfish/jersey/containers/jersey_container_servlet"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/glassfish/jersey/core:jersey_common",
        "//third_party/maven/org/glassfish/jersey/core:jersey_server",
        ":jersey_container_servlet_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jersey_container_servlet_core",
    exports = [
        "//external:jar/mvnorg/glassfish/jersey/containers/jersey_container_servlet_core"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/glassfish/hk2/external:javax_inject",
        "//third_party/maven/org/glassfish/jersey/core:jersey_common",
        "//third_party/maven/org/glassfish/jersey/core:jersey_server"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


