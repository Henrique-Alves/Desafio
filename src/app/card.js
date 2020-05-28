import React from 'react';
import listaGame from './arquivoJson.js';

const Card = () => {
    return(
        listaGame.games.map((element, index) => (
            <div className="card">
              <img src={element.img}  className="card-img-top" alt="..."/><p>Henrique</p>
              <div className="card-body">
                <h5 className="card-title">
                {"Jogo: "+ element.nome} 
                {" ,Ano de Lançamento: "+ element.anoLancamento} 
                {" ,Estilo do Jogo: "+ element.tipo}
                {" ,Nota do jogo: "+ element.nota}
                </h5>
                <p className="card-text">Jogos que mais joguei de 2017 a 2020</p>
              </div>
            </div>     
           ))    
    );
}

export default Card;