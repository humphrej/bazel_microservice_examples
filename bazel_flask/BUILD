
load("@my_deps//:requirements.bzl", "all_requirements")
load("@io_bazel_rules_docker//python:image.bzl", "py_image")

package(default_visibility = ["//visibility:public"])


py_library(
  name = "greeting",
  srcs = [ "greeting.py"]
)

py_test(
    name = "greeting_test",
    srcs = ["greeting_test.py"],
    deps = [
        "greeting",
    ],
)


py_image(
    name = "server",
    srcs = ["hello.py"],
    main = "hello.py",
    deps = all_requirements + ["greeting"],
)

