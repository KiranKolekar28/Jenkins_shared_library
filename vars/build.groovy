  // stage("Image build"){
  //           steps{
  //               echo "We will create image from Dockerfile"
  //               sh "docker build -t insect:latest . "
  //           }
  //       }


// def call (){
//    echo "We will create image from Dockerfile"
//    sh "docker build -t insect:latest . "
// }


def call (imageName , tag , location){
    echo "We will build image"
    sh " docker build -t ${imageName}:${tag} ${location} "
}
