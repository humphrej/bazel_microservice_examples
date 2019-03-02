
Tested with Bazel 0.20.0

$ bazel build //...
$ bazel test //...
$ bazel run //src/main/java/hello:hello_server_image
$ docker run -it bazel/src/main/java/hello:hello_server_image
$ docker run -it -p 8080:8080 -p 8081:8081  -v$PWD:/mnt/local bazel/src/main/java/hello:hello_server_image hello_server_deploy.jar server /mnt/local/config.yml


