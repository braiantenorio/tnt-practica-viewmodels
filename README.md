# Práctica de Arquitectura: Desacoplar una App Acoplada

Este repositorio contiene una app Android sencilla con una arquitectura **intencionalmente acoplada**, donde toda la lógica está dentro de una sola `MainActivity`.  
El objetivo es **refactorizar la app para aplicar una arquitectura desacoplada** usando buenas prácticas de Android moderno.

---

## Objetivo

Refactorizar el proyecto para separar responsabilidades y aplicar los principios de **arquitectura por capas**, utilizando:

- `ViewModel` y `LiveData`
- Separación entre lógica de UI y lógica de negocio
- (Opcional) Casos de uso y `sealed class` para representar estados

---

## Estructura sugerida

```plaintext
app/
└── ui/
    └── main/
        ├── MainActivity.kt
        └── MainViewModel.kt
└── domain/
    └── GenerarSaludoUseCase.kt

```