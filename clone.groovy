def call(string url, string branch){
  echo"this is cloning the code"
  git url: "https://github.com/sandyjyp/jenkins-shared-libraries.git", branch:"main"
  echo"code cloning successful"
}
