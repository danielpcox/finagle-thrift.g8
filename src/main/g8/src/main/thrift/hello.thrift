namespace java $package$.hello

struct HelloMsg {
  1: required string name;
}

service HelloService {
  string sayHello(1:HelloMsg msg)
}