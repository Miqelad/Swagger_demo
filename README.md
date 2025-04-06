<h1>🚀 Demo Spring Boot + Swagger проект</h1>

<p>Это небольшой тестовый проект на <strong>Spring Boot</strong> с подключенным <strong>Swagger UI</strong>.</p>

<h2>📚 Что здесь есть</h2>
<ul>
  <li>Простые контроллеры через интерфейсы (<code>HelloApi</code>)</li>
  <li>Описание методов для Swagger через аннотации <code>@Operation</code>, <code>@Parameter</code></li>
  <li>Готовая настройка <strong>Swagger UI</strong> для тестирования API</li>
  <li>Подключена <strong>авторизация</strong> через <strong>Bearer JWT</strong> (кнопка Authorize 🔒)</li>
</ul>

<h2>🌐 Как запустить</h2>
<ol>
  <li>Склонируй или распакуй проект</li>
  <li>В терминале запусти:
    <pre><code>./mvnw spring-boot:run</code></pre>
    Или если Maven уже установлен:
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <li>Открой Swagger UI:
    <br>
    👉 <a href="http://localhost:8080/swagger-ui.html" target="_blank">http://localhost:8080/swagger-ui.html</a>
  </li>
</ol>

<h2>✨ Доступные методы</h2>
<table border="1" cellpadding="6" cellspacing="0">
  <thead>
    <tr>
      <th>Метод</th>
      <th>Описание</th>
      <th>URL</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>GET /api/hello/ping</code></td>
      <td>Проверка сервера</td>
      <td><code>/api/hello/ping</code></td>
    </tr>
    <tr>
      <td><code>GET /api/hello/say?name=Имя</code></td>
      <td>Приветствие по имени</td>
      <td><code>/api/hello/say?name=Alex</code></td>
    </tr>
  </tbody>
</table>

<p><strong>P.S.</strong> Можешь использовать кнопку <strong>Authorize</strong> 🔒 для ввода токена.</p>
