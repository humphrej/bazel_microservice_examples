load("@io_bazel_rules_docker//container:container.bzl", "container_image")

java_library(
    name = "hello_spring_boot_server_lib",
    srcs = glob(["*.java"]),

    deps = [
        "//third_party/maven/org/springframework:spring_webmvc",
        "//third_party/maven/org/springframework:spring_web",
        "//third_party/maven/org/springframework:spring_context",
        "//third_party/maven/org/springframework/boot:spring_boot",
        "//third_party/maven/org/springframework/boot:spring_boot_autoconfigure",
    ],
    visibility = ["//src/test/java/hello:__pkg__"],
)

load("@io_bazel_rules_docker//java:image.bzl", "java_image")

java_image(
    name = "hello_spring_boot_server",
    main_class = "hello.Application",
    base = "@java_base//image",

    runtime_deps = [
        "hello_spring_boot_server_lib",
        "//third_party/maven/org/springframework/boot:spring_boot_starter_tomcat",
        "//third_party/maven/org/springframework/boot:spring_boot_starter_json",
    ],
    visibility = ["//src/test/java/hello:__pkg__"],
)

