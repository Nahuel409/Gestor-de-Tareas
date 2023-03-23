<h1>API de Tareas con Arquitectura Hexagonal</h1>
<p>Este es un proyecto que implementa la arquitectura hexagonal para la creación de una API de tareas, así como para el consumo de una API externa en línea.</p>

<h2>¿Qué es la Arquitectura Hexagonal?</h2>
<p>La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, es un patrón de diseño de software que se centra en separar la lógica de negocio de los detalles técnicos de implementación. En este enfoque, la lógica de negocio se coloca en el centro de la arquitectura, rodeada de capas de puertos y adaptadores que permiten la interacción con el mundo exterior.</p>
<p>En la implementación de esta arquitectura, se utilizan tres capas principales:</p>
<ul>
		<li><strong>Capa de Dominio:</strong> Esta capa contiene la lógica de negocio del sistema, representada por entidades y casos de uso.</li>
		<li><strong>Capa de Adaptadores:</strong> Esta capa se encarga de adaptar la lógica de negocio del sistema a los diferentes puertos, como por ejemplo una API REST o una base de datos.</li>
		<li><strong>Capa de Infraestructura:</strong> Esta capa contiene la implementación concreta de los puertos, como por ejemplo el código para conectarse a una base de datos o para consumir una API externa.</li>
</ul>
	<h2>¿Qué hace este proyecto?</h2>
	<p>Este proyecto implementa la arquitectura hexagonal para la creación de una API de tareas, donde se pueden crear, leer, actualizar y eliminar tareas. Además, se utiliza una API externa en línea para obtener información sobre usuarios.</p>
	<p>La API de tareas consta de los siguientes endpoints:</p>
	<ul>
		<li><code>GET http://localhost:8080/task</code>: Obtiene todas las tareas.</li>
		<li><code>POST http://localhost:8080/task</code>: Crea una nueva tarea.</li>
		<li><code>GET http://localhost:8080/task/{id}</code>: Obtiene una tarea específica por ID.</li>
		<li><code>PUT http://localhost:8080/task/{id}</code>: Actualiza una tarea existente.</li>
		<li><code>DELETE http://localhost:8080/task/{id}</code>: Elimina una tarea existente.</li>
	</ul>
  <h2>Consumo de Api Externa</h2>
<p>Además, esta API también permite consultar información sobre los usuarios registrados en el sistema, utilizando la API externa en línea <a href="https://jsonplaceholder.typicode.com/users/" target="_blank">https://jsonplaceholder.typicode.com/users/</a>. Para consultar información de un usuario específico, se puede utilizar la siguiente URL:</p>

<pre><code>GET api/task//additional-info/{id}: Obtiene información de un usuario específico por ID.</code></pre>

<h2>¡Despedida Y Aprendizaje!</h2>
<p>Al realizar este proyecto, pude aprender en profundidad la práctica de la arquitectura hexagonal y cómo aplicarla en el diseño de una API de tareas. Esta metodología me permitió separar claramente las responsabilidades y capas del software, lo que facilitó la implementación de nuevos endpoints y mejoras en la funcionalidad de la API. Además, gracias a la arquitectura hexagonal, pude lograr una mayor flexibilidad en la elección de tecnologías para la capa de infraestructura, lo que permitió integrar de manera sencilla la API externa para obtener información sobre los usuarios registrados en el sistema. En definitiva, este proyecto me permitió aplicar en la práctica los conceptos y beneficios de la arquitectura hexagonal en un proyecto real, lo que me brindó una valiosa experiencia en el desarrollo de software modular y escalable.</p>
<p>"Por otro lado quiero agradecer por tomarse el tiempo de revisar mi proyecto. Espero que les haya gustado y encontrado útil. Si tienen alguna pregunta o sugerencia, no duden en contactarme. ¡Gracias nuevamente por su tiempo y apoyo!"</p>

<p>Author: Diego Villan </p>

