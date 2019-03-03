java_test(
    name = "hello_tests",
    size = "small",
    srcs = glob(["*.java"]),
    test_class= "hello.GreetingResourceTest",
    deps = [
        "//src/main/java/hello:hello_dropwizard_server_lib",
        "//third_party/maven/io/dropwizard:dropwizard_testing",
        "//third_party/maven/junit:junit",
        "//third_party/maven/org/hamcrest:hamcrest_core",
        "//third_party/maven/javax/ws/rs:javax_ws_rs_api",
    ],
    #visibility = ["//visibility:public"]
)

