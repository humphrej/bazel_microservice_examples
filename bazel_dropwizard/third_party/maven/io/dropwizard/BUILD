java_library(
    name = "dropwizard_configuration",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_configuration"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/dataformat:jackson_dataformat_yaml",
        "//third_party/maven/org/apache/commons:commons_lang3",
        "//third_party/maven/org/apache/commons:commons_text",
        ":dropwizard_jackson",
        ":dropwizard_validation"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_core",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_core"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/io/dropwizard/metrics:metrics_core",
        "//third_party/maven/io/dropwizard/metrics:metrics_healthchecks",
        "//third_party/maven/io/dropwizard/metrics:metrics_jmx",
        "//third_party/maven/io/dropwizard/metrics:metrics_jvm",
        "//third_party/maven/io/dropwizard/metrics:metrics_servlets",
        "//third_party/maven/net/sourceforge/argparse4j:argparse4j",
        "//third_party/maven/org/eclipse/jetty/toolchain/setuid:jetty_setuid_java",
        ":dropwizard_configuration",
        ":dropwizard_jackson",
        ":dropwizard_jersey",
        ":dropwizard_jetty",
        ":dropwizard_lifecycle",
        ":dropwizard_logging",
        ":dropwizard_metrics",
        ":dropwizard_request_logging",
        ":dropwizard_servlets",
        ":dropwizard_util",
        ":dropwizard_validation"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "dropwizard_jackson",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_jackson"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/maven/com/fasterxml/jackson/core:jackson_core",
        "//third_party/maven/com/fasterxml/jackson/core:jackson_databind",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_guava",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_jdk8",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_joda",
        "//third_party/maven/com/fasterxml/jackson/datatype:jackson_datatype_jsr310",
        "//third_party/maven/com/fasterxml/jackson/module:jackson_module_afterburner",
        "//third_party/maven/com/fasterxml/jackson/module:jackson_module_parameter_names",
        "//third_party/maven/com/google/guava:guava",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_util"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "dropwizard_jersey",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_jersey"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/jaxrs:jackson_jaxrs_json_provider",
        "//third_party/maven/io/dropwizard/metrics:metrics_jersey2",
        "//third_party/maven/org/apache/commons:commons_lang3",
        "//third_party/maven/org/eclipse/jetty:jetty_continuation",
        "//third_party/maven/org/eclipse/jetty:jetty_server",
        "//third_party/maven/org/eclipse/jetty:jetty_webapp",
        "//third_party/maven/org/glassfish/jersey/containers:jersey_container_servlet",
        "//third_party/maven/org/glassfish/jersey/core:jersey_server",
        "//third_party/maven/org/glassfish/jersey/ext:jersey_bean_validation",
        "//third_party/maven/org/glassfish/jersey/ext:jersey_metainf_services",
        ":dropwizard_jackson",
        ":dropwizard_logging",
        ":dropwizard_validation"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "dropwizard_jetty",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_jetty"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/io/dropwizard/metrics:metrics_jetty9",
        "//third_party/maven/org/eclipse/jetty:jetty_http",
        "//third_party/maven/org/eclipse/jetty:jetty_server",
        "//third_party/maven/org/eclipse/jetty:jetty_servlet",
        "//third_party/maven/org/eclipse/jetty:jetty_servlets",
        ":dropwizard_logging"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_lifecycle",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_lifecycle"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/google/guava:guava",
        "//third_party/maven/org/eclipse/jetty:jetty_server",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_logging",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_logging"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/ch/qos/logback:logback_classic",
        "//third_party/maven/ch/qos/logback:logback_core",
        "//third_party/maven/io/dropwizard/metrics:metrics_logback",
        "//third_party/maven/org/eclipse/jetty:jetty_util",
        "//third_party/maven/org/slf4j:jcl_over_slf4j",
        "//third_party/maven/org/slf4j:jul_to_slf4j",
        "//third_party/maven/org/slf4j:log4j_over_slf4j",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_jackson",
        ":dropwizard_validation"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_metrics",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_metrics"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/io/dropwizard/metrics:metrics_core",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_jackson",
        ":dropwizard_lifecycle",
        ":dropwizard_validation"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "dropwizard_request_logging",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_request_logging"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/ch/qos/logback:logback_access",
        ":dropwizard_jetty",
        ":dropwizard_logging"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_servlets",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_servlets"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/ch/qos/logback:logback_classic",
        "//third_party/maven/io/dropwizard/metrics:metrics_annotation",
        "//third_party/maven/io/dropwizard/metrics:metrics_core",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_testing",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_testing"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/junit:junit",
        "//third_party/maven/org/assertj:assertj_core",
        "//third_party/maven/org/glassfish/jersey/test_framework/providers:jersey_test_framework_provider_inmemory",
        "//third_party/maven/org/objenesis:objenesis",
        ":dropwizard_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "dropwizard_util",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_util"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/maven/com/google/code/findbugs:jsr305",
        "//third_party/maven/com/google/guava:guava",
        "//third_party/maven/joda_time:joda_time"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "dropwizard_validation",
    exports = [
        "//external:jar/mvnio/dropwizard/dropwizard_validation"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/glassfish:javax_el",
        "//third_party/maven/org/hibernate:hibernate_validator",
        "//third_party/maven/org/javassist:javassist",
        "//third_party/maven/org/slf4j:slf4j_api",
        ":dropwizard_util"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


