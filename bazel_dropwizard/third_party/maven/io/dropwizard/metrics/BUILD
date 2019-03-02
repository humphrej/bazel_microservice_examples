java_library(
    name = "metrics_annotation",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_annotation"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "metrics_core",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_core"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_healthchecks",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_healthchecks"
    ],
    licenses = [
        "permissive"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_jersey2",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_jersey2"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_annotation",
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_jetty9",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_jetty9"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_jmx",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_jmx"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_json",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_json"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_jvm",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_jvm"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_logback",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_logback"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        ":metrics_core"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)



java_library(
    name = "metrics_servlets",
    exports = [
        "//external:jar/mvnio/dropwizard/metrics/metrics_servlets"
    ],
    licenses = [
        "permissive"
    ],
    runtime_deps = [
        "//third_party/maven/com/papertrail:profiler",
        ":metrics_core",
        ":metrics_healthchecks",
        ":metrics_json",
        ":metrics_jvm"
    ],
    visibility = [
        "//third_party/maven:__subpackages__"
    ]
)


