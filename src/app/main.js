import React from "react";

import { SESSION } from "../../constants";
import { useSession } from "../../hooks";
import {
  LayoutProvider,
  LayoutI,
  defaultLayout,
} from "../../contexts/layoutContext";
import Header from "../../components/Header";
import NavLeft from "../../components/NavLeft";

const MainLayout = (props) => {
  return (
      <section className="main-app">    
        <main>
          {props.children}
        </main>
        <footer>footer</footer>
      </section>
  );
};

export default MainLayout;