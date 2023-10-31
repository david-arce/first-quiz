Security aspects to be taken into account.
1.injection: Check for code injection vulnerabilities, especially in MySQL database queries, because outsiders can cause serious damage and even employees can mistakenly delete important data.

2.Broken authentication: Authentication must be secure and necessary measures such as secure passwords, proper session handling such as expiration times and secure tokens must be implemented.

3.Exposure of sensitive data: Encryption techniques should be applied and access to sensitive data should be limited, which means reviewing security measures in the MySQL database to prevent sensitive information from being leaked.

4.External XML entities (XXE): verify that there are no XXE vulnerabilities in the backend by validating data entries. The application should be made to accept a less complex data type such as JSON or at least patch the XML parsers and disable the use of external entities.

5.Loss of access control: Review the different permissions and access by user levels so that users have the minimum permissions and do not have unwanted permissions.

6.Misconfiguration of security: Make sure that the configuration of the AWS and Kubernetes environment is correctly implemented and do not use default configurations or show errors that are too detailed.

7.Cross-site scripting: Perform a security audit on the Frontend that is written in Next.js to detect vulnerabilities in time.

8.Unsafe deserialisation: Validate and filter the data that is deserialised in the application.

9.Use of components with known vulnerabilities: Frequently update the components and libraries used in the application to avoid known vulnerabilities.

10.Insufficient logging and monitoring: Implement logging and monitoring plans to have a better response to incidents or attacks that the application may have.