plugins {
	java
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Dependência principal do Spring Core/Context
	implementation("org.springframework:spring-context:6.1.14")

	// Suporte a AOP
	implementation("org.springframework:spring-aop:6.1.14")
	implementation("org.aspectj:aspectjweaver:1.9.22")

	// Testes (sem Boot, usamos JUnit 5 direto + Spring Test)
	testImplementation("org.springframework:spring-test:6.1.14")
	testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
