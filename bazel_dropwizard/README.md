
Tested with Bazel 0.20.0

1. Build the application
    $ bazel build //...
1. Test the application
    $ bazel test //...
1. Download the image to the local docker
    $ bazel run //src/main/java/hello:hello_dropwizard_server -- --norun
1. Run the application
    $ docker run -it -p 8080:8080 -p 8081:8081  -v$PWD:/mnt/local bazel/src/main/java/hello:hello_server_image hello_server_deploy.jar server /mnt/local/config.yml


