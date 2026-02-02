import { Email, GitHub, LinkedIn } from "@mui/icons-material";
import React from "react";
import FooterCSS from "./Footer.module.css";

const Footer = () => {
  return (
    <div className={FooterCSS.Footer}>
      <div className={FooterCSS.footercontainer}>
        <h1>SYAM ATLURI</h1>
        <div className={FooterCSS.icons}>
          {" "}
          <a
            href="https://www.linkedin.com/in/syamatluri/"
            target="_blank"
            rel="noreferrer"
          >
            <LinkedIn className={FooterCSS.icon} />
          </a>
          <a href="https://github.com/Shyamatluri4" target="_blank" rel="noreferrer">
            <GitHub className={FooterCSS.icon} />
          </a>
          <a href="mailto:contactme.syamatluri04@gmail.com">
            <Email className={FooterCSS.icon} />
          </a>
        </div>
      </div>
    </div>
  );
};

export default Footer;
