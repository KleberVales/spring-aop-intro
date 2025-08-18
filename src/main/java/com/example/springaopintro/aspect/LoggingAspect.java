package com.example.springaopintro.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.springaopintro.service.*.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void beforeAdvice() {
        System.out.println("🔍 [BEFORE] Iniciando método de serviço...");
    }

    @After("serviceMethods()")
    public void afterAdvice() {
        System.out.println("✅ [AFTER] Método de serviço finalizado.");
    }

    @Around("serviceMethods()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = pjp.proceed(); // executa o método original
        long end = System.currentTimeMillis();
        System.out.println("⏱️ [AROUND] Tempo de execução: " + (end - start) + "ms");
        return result;

    }
}
