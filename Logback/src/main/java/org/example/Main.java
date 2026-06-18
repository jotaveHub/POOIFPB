package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static void main() {
        Logger logger = LoggerFactory.getLogger(Main.class.getSimpleName());
        logger.info("Usuário acessou a aplicação");
    }
}
