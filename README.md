# CS-305-Project-Two
Secure software practices report for Artemis Financial, including checksum implementation, HTTPS support, and vulnerability scanning.

##Artemis Financial – Project Two Write-Up
##Summary of Client and Requirements

Artemis Financial is a company that helps people plan their money and future stuff like saving and retirement. They wanted me to make their app safer because client data is super important. My main job was to set up file verification (checksums) and make sure the website ran over HTTPS instead of regular HTTP.

##What I Did Well

I think I did a good job finding where the app needed better security and actually fixing it. Setting up HTTPS and adding the checksum feature went pretty smoothly once I got the hang of it. Coding securely is important because companies can lose customers (and a lot of money) if their apps get hacked. Making stuff secure adds a lot of trust for a business.

##Challenges and Helpful Parts

Figuring out how to make the SSL certificate work was probably the hardest part. At first, the app kept yelling at me, but once I learned how to use the keytool and set up HTTPS, it made way more sense. Honestly, learning how to do that was really helpful and will probably save me a lot of headaches later.

##Increasing Layers of Security

To make the app more secure, I:
  -Turned on HTTPS so everything between the server and browser is encrypted
  -Added SHA-256 hashing to check if data gets changed
  -Ran an OWASP scan to check for any security problems in the code
  -Later on, I’d definitely use better vulnerability scanners and maybe automate some of the security checks.

##Making Sure Code Was Secure and Functional

I ran the app after making my changes to make sure it didn't crash. I tested the /hash route to see if it worked (which it did, yippeee!), and then I ran a security scan using OWASP Dependency-Check to make sure I didn’t break anything or add new problems.

##Helpful Resources, Tools, or Practices

Stuff that helped me a ton:
  -keytool to create and export SSL certificates
  -SHA-256 hashing for easy file/data verification
  -OWASP Dependency-Check to find security issues
  -Maven to run builds and automate tests

What I Could Show Future Employers
I’d show them that I know how to:

  -Secure a website with HTTPS
  -Create and manage SSL certs
  -Add checksums to protect data
  -Scan and fix vulnerabilities in apps
