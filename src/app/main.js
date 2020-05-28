import React from "react";
import Header from "../../src/app/header";
import Card from '../app/card';



const MainLayout = (props) => {
  return (
      <section className="main-app">   
         <Header /> 
         <Card />
        <main>
          {props.children}
        </main>
        <footer>footer</footer>
      </section>
  );
};

export default MainLayout;