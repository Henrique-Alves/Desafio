import React from 'react';
import listaGame from '../app/components.js';

function App() {
  return (
    <div className="App">
      <header className="nav">
        <div className="container">
          <nav className="navbar navbar-dark bg-dark">
            <h6><listaGame /></h6>
          </nav>
        </div>
      </header>

      <div class="card-deck">
        <div class="card">
          <img src="..." class="card-img-top" alt="..." />
          <div class="card-body"><listaGame />
            <h5 class="card-title"></h5>
            <p class="card-text"><listaGame /></p>
            <p class="card-text"><small class="text-muted"><listaGame /></small></p>
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
