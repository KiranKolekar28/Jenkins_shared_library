def clone(string url , string branch)
{
  echo "lets clone branch"
  git url: "${url}", branch: "${branch} 
}
