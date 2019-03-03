java_library(
    name = "spring_boot",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/springframework:spring_context",
        "//third_party/maven/org/springframework:spring_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_autoconfigure",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_autoconfigure"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_boot"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_starter",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_starter"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/annotation:javax_annotation_api",
        "//third_party/maven/org/springframework:spring_core",
        "//third_party/maven/org/yaml:snakeyaml",
        ":spring_boot",
        ":spring_boot_autoconfigure",
        ":spring_boot_starter_logging"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "spring_boot_starter_json",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_starter_json"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_jdk8",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_jsr310",
        "//third_party/maven/com/fasterxml/jackson/module:jackson_module_parameter_names",
        "//third_party/maven/org/springframework:spring_web",
        ":spring_boot_starter"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_starter_logging",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_starter_logging"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/ch/qos/logback:logback_classic",
        "//third_party/maven/org/apache/logging/log4j:log4j_to_slf4j",
        "//third_party/maven/org/slf4j:jul_to_slf4j"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "spring_boot_starter_tomcat",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_starter_tomcat"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/javax/annotation:javax_annotation_api",
        "//third_party/maven/org/apache/tomcat/embed:tomcat_embed_core",
        "//third_party/maven/org/apache/tomcat/embed:tomcat_embed_el",
        "//third_party/maven/org/apache/tomcat/embed:tomcat_embed_websocket"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_starter_web",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_starter_web"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/hibernate/validator:hibernate_validator",
        "//third_party/maven/org/springframework:spring_web",
        "//third_party/maven/org/springframework:spring_webmvc",
        ":spring_boot_starter",
        ":spring_boot_starter_json",
        ":spring_boot_starter_tomcat"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_test",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_test"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_boot"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spring_boot_test_autoconfigure",
    exports = [
        "//external:jar/mvnorg/springframework/boot/spring_boot_test_autoconfigure"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":spring_boot_autoconfigure",
        ":spring_boot_test"
    ],
    visibility = [
        "//visibility:public"
    ]
)


