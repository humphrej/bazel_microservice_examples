java_library(
    name = "tomcat_embed_core",
    exports = [
        "//external:jar/mvnorg/apache/tomcat/embed/tomcat_embed_core"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/apache/tomcat:tomcat_annotations_api"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "tomcat_embed_el",
    exports = [
        "//external:jar/mvnorg/apache/tomcat/embed/tomcat_embed_el"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "tomcat_embed_websocket",
    exports = [
        "//external:jar/mvnorg/apache/tomcat/embed/tomcat_embed_websocket"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":tomcat_embed_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


