# 🛒 E-Commerce Microservices Application

Welcome to the **E-Commerce Microservices Application** – a hands-on project built to demonstrate modern **microservices architecture** using **Spring Boot 3** and **Spring Cloud** ecosystem.

This project is developed as part of a **training**,  focusing on a critical microservices pattern or practice.

---

## 🧩 Microservices Overview

The application simulates a simple e-commerce system where customers can order products. It consists of the following microservices:

### 1. **Product Service**
- Manages the product catalog (CRUD operations)

### 2. **Inventory Service**
- Maintains product stock levels and availability

### 3. **Order Service**
- Handles customer orders and coordinates with Inventory

### 4. **Notification Service**
- Listens to order events and sends user notifications

---



---

## 🚀 Technologies Used

- **Java 17+**
- **Spring Boot 3**
- **Spring Cloud** (OpenFeign, Eureka, Gateway, Config)
- **Keycloak**
- **Apache Kafka**
- **Resilience4J**
- **OpenTelemetry**, **Grafana Tempo**, **Loki**, **Prometheus**
- **Docker** & **Docker Compose**
- **Kubernetes**

---

## 📦 Project Structure
├── product-service/
├── inventory-service/
├── order-service/
├── notification-service/
├── discovery-server/ # Eureka Server
├── api-gateway/ # Spring Cloud Gateway
├── config-server/ # Centralized Configuration
├── security/ # Keycloak related setup
├── observability/ # Tempo, Loki, Prometheus setup
├── docker-compose.yml
├── k8s/ # Kubernetes manifests
└── README.md

