def call(String projectName ,String imageName, String imageTag  ){
 stage("Pushing image to the Dockerhub"){
            steps{
                echo " lets push image to the docker hub"
                withCredentials([usernamePassword('credentialsId':"DockerHubCred" ,
                passwordVariable:"dockerHubPass" , 
                usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
                sh "docker tag ${imageName}:${imageTag} ${env.dockerHubUser}/${imageName}:${imageTag} "
                sh "docker push ${env.dockerHubUser}/${imageName}:${imageTag}"
                }
            }
        }
}
