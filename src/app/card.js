import React from 'react';
import listaGame from './arquivoJson.js';

const Card = () => {
    return (
        listaGame.games.map((element, index) => (       
            <div className="row row-cols-1 row-cols-md-3">
                <div className="col mb-4">
                    <div className="card h-100">
                        <img src={element.img} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">
                                {"Jogo: " + element.nome}
                                {", Ano de Lançamento: " + element.anoLancamento}
                                {", Estilo do Jogo: " + element.tipo}
                                {", Nota do jogo: " + element.nota}
                            </h5>
                            <p className="card-text">.</p>
                        </div>
                    </div>
                </div>
                <div className="col mb-4">
                    <div className="card h-100">
                        <img src={element.img} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">{"Jogo: " + element.nome}
                                {", Ano de Lançamento: " + element.anoLancamento}
                                {", Estilo do Jogo: " + element.tipo}
                                {", Nota do jogo: " + element.nota}</h5>
                            <p className="card-text">This is a short card.</p>
                        </div>
                    </div>
                </div>
                <div className="col mb-4">
                    <div className="card h-100">
                        <img src={element.img} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">{"Jogo: " + element.nome}
                                {", Ano de Lançamento: " + element.anoLancamento}
                                {", Estilo do Jogo: " + element.tipo}
                                {", Nota do jogo: " + element.nota}</h5>
                            <p className="card-text"></p>
                        </div>
                    </div>
                </div>
            </div>
        ))
    );
}

export default Card;