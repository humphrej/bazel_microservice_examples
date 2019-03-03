
Tested with Bazel 0.20.0

1. Build the application
    $ bazel build //...
1. Run the tests
    $ bazel test //...
1. Download the image to the local docker
    $ docker run -it bazel/src/main/java/hello:hello_spring_boot_server
1. Run the docker image locally 
    $ docker run -it -p 8080:8080 bazel/src/main/java/hello:hello_server_image 


