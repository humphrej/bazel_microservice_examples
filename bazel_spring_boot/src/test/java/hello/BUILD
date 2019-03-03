java_test(
    name = "hello_tests",
    size = "small",
    srcs = glob(["*.java"]),
    test_class= "hello.GreetingControllerTests",
    deps = [
        "//src/main/java/hello:hello_spring_boot_server_lib",
        "//third_party/maven/org/springframework:spring_core",
        "//third_party/maven/org/springframework/boot:spring_boot_test",
        "//third_party/maven/org/springframework/boot:spring_boot_test_autoconfigure",
        "//third_party/maven/org/springframework:spring_beans",
        "//third_party/maven/org/springframework:spring_test",
        "//third_party/maven/org/springframework/boot:spring_boot_starter_web",
        "//third_party/maven/junit:junit",
        "//third_party/maven/org/hamcrest:hamcrest_core",
        "//third_party/maven/com/jayway/jsonpath:json_path",
    ],
    #visibility = ["//visibility:public"]
)

