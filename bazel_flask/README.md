
Tested with Bazel 0.20.0

1. Build the application
    $ bazel build //...
1. Test the application
    $ bazel test //...
1. Download the image to the local docker and run 
    $ bazel run //:server 

Flask application based on the hellohttp example in https://github.com/bazelbuild/rules_k8s

