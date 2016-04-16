- nice example of how to submit a Scalding job to EMR is [here](https://github.com/snowplow/scalding-example-project)
- `aws s3 cp <local source> <destination>` allows you to copy files from local machine to S3
- `aws s3 mb <bucket_name>` allows you to create buckets (NOTE buckets can't have the '-' character in them)
- to get cascading dependencies to properly install, have to add the lines
```
resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"
```
 to `build.sbt`
