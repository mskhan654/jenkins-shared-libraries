def call(String url, String branch){
  echo "This is coding"
                git "${url}": url, branch: "${branch}"
                echo "Code cloning is successful"
            }
