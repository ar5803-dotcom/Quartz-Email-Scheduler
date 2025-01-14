# Quartz Email Scheduler

This is a Spring Boot application that allows users to schedule emails using the Quartz scheduling library. With this application, you can define the email content, recipient, and the date/time to send the email, and the system will handle the rest.

## Features

- Schedule emails to be sent at a specific date and time.
- Leverages **Quartz Scheduler** for job scheduling.
- Validates input fields like email, subject, body, and scheduling time.
- Provides a RESTful API for scheduling emails.
- Sends emails using Spring Boot's **JavaMailSender**.

---

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 8 or higher
- Maven 3.6+ or Gradle
- Git
- A valid SMTP email configuration (e.g., Gmail SMTP)

---

## Setup Instructions

### Clone the Repository

```bash
git clone https://github.com/ar5803-dotcom/Quartz-Email-Scheduler.git
cd Quartz-Email-Scheduler
