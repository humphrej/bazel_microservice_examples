java_library(
    name = "spring_aop",
    exports = [
        "//external:jar/mvnorg/springframework/spring_aop"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_beans",
        ":spring_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "spring_beans",
    exports = [
        "//external:jar/mvnorg/springframework/spring_beans"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_context",
    exports = [
        "//external:jar/mvnorg/springframework/spring_context"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_aop",
        ":spring_beans",
        ":spring_core",
        ":spring_expression"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_core",
    exports = [
        "//external:jar/mvnorg/springframework/spring_core"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_jcl"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_expression",
    exports = [
        "//external:jar/mvnorg/springframework/spring_expression"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "spring_jcl",
    exports = [
        "//external:jar/mvnorg/springframework/spring_jcl"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "spring_test",
    exports = [
        "//external:jar/mvnorg/springframework/spring_test"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_web",
    exports = [
        "//external:jar/mvnorg/springframework/spring_web"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_beans",
        ":spring_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_webmvc",
    exports = [
        "//external:jar/mvnorg/springframework/spring_webmvc"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_aop",
        ":spring_beans",
        ":spring_context",
        ":spring_core",
        ":spring_expression",
        ":spring_web"
    ],
    visibility = [
        "//visibility:public"
    ]
)


