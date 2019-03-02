load("@io_bazel_rules_docker//container:container.bzl", "container_image")

java_library(
    name = "hello_server_lib",
    srcs = glob(["*.java"]),

    deps = [
        "//third_party/maven/io/dropwizard:dropwizard_core",
        "//third_party/maven/io/dropwizard:dropwizard_jackson",
        "//third_party/maven/io/dropwizard:dropwizard_jersey",
        "//third_party/maven/io/dropwizard/metrics:metrics_annotation",
        "//third_party/maven/com/fasterxml/jackson/core:jackson_annotations",
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
        "//third_party/maven/org/hibernate:hibernate_validator",
    ],
    visibility = ["//src/test/java/hello:__pkg__"],
)

java_binary(
    name = "hello_server",
    main_class = "hello.HelloApplication",

    runtime_deps = [
        "hello_server_lib",
    ],
    visibility = ["//src/test/java/hello:__pkg__"],
)

container_image(
    name = "hello_server_image",
    base = "@java_base//image",
    files = [":hello_server_deploy.jar"],
    cmd = ["hello_server_deploy.jar"],
    ports = ["8001"]
)

