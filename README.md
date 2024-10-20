# MS-Security

## Descripción
**MS-Security** es un sistema de autenticación y autorización para proteger aplicaciones web. Implementa un backend en Node.js con soporte para JWT (JSON Web Tokens) y OAuth2.

## Tabla de Contenidos
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## Características
- Autenticación basada en JWT.
- Soporte para OAuth2 (Google y Facebook).
- Middleware para proteger rutas.
- Gestión de usuarios y roles.
- Validación de contraseñas seguras.

## Requisitos
- Node.js v14 o superior
- MongoDB
- Postman (opcional, para pruebas)

## Instalación
1. Clona este repositorio:
    ```bash
    git clone https://github.com/usuario/ms-security.git
    cd ms-security
    ```

2. Instala las dependencias:
    ```bash
    npm install
    ```

3. Crea un archivo `.env` con las siguientes variables:
    ```
    PORT=3000
    MONGODB_URI=mongodb://localhost:27017/ms-security
    JWT_SECRET=mi_secreto_jwt
    OAUTH_CLIENT_ID=tu_cliente_id
    OAUTH_CLIENT_SECRET=tu_cliente_secreto
    ```

4. Inicia el servidor:
    ```bash
    npm start
    ```

## Uso
- **Rutas protegidas:** Usa JWT en los encabezados de las solicitudes para acceder a rutas protegidas.
- **Registro y Login:** Las rutas `/register` y `/login` permiten registrar y autenticar usuarios.
- **Pruebas:** Puedes usar Postman para enviar solicitudes a las rutas de la API.

## Contribuir
¡Las contribuciones son bienvenidas! Por favor, sigue estos pasos:
1. Haz un fork del proyecto.
2. Crea una rama nueva:
    ```bash
    git checkout -b feature/nueva-funcionalidad
    ```
3. Haz tus cambios y realiza un commit:
    ```bash
    git commit -m "Agrega nueva funcionalidad"
    ```
4. Haz push a tu rama:
    ```bash
    git push origin feature/nueva-funcionalidad
    ```
5. Crea un **Pull Request** en GitHub.

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## Contacto
Si tienes preguntas o sugerencias, no dudes en abrir un issue o contactarme en:
- **Correo:** usuario@ejemplo.com
- **GitHub:** [usuario](https://github.com/usuario)
