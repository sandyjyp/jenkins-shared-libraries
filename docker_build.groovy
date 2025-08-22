def call(string ProjectName, string ImageName, string DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
