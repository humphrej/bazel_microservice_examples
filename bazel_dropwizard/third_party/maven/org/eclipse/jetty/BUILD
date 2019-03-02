java_library(
    name = "jetty_continuation",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_continuation"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_http",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_http"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_io",
        ":jetty_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_io",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_io"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_security",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_security"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_server"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_server",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_server"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/servlet:javax_servlet_api",
        ":jetty_http",
        ":jetty_io"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_servlet",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_servlet"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_security"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_servlets",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_servlets"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_continuation",
        ":jetty_http",
        ":jetty_io",
        ":jetty_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_util",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_util"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_webapp",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_webapp"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_servlet",
        ":jetty_xml"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "jetty_xml",
    exports = [
        "//external:jar/mvnorg/eclipse/jetty/jetty_xml"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":jetty_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


