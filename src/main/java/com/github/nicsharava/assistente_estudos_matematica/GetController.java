package com.github.nicsharava.assistente_estudos_matematica;

import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class GetController {
    @PostMapping("/calcular")
    public static Response estaCerto(@RequestBody Info calculo){
        if(calculo.getN() >= calculo.getP()){
            // Fórmula da combinação simples: C n p = n! / p!(n - p)!
            // Fórmula do arranjo simples: A n p = n! / (n-p)

            int n = calculo.getN();
            int p = calculo.getP();
            int nFatorial = fatorial(n);
            int pFatorial = fatorial(p);
            int resposta = 0;

            if("COMBINAÇÃO".equalsIgnoreCase(calculo.getTipo())){
                if (calculo.getResposta() == nFatorial / (pFatorial * fatorial(n - p))){
                    resposta = nFatorial/ (pFatorial * fatorial(n-p));

                    return new Response(resposta,true);
                } else{
                    resposta = nFatorial/ (pFatorial * fatorial(n-p));
                    return new Response(resposta,false);

                }

            } else if ("ARRANJO".equalsIgnoreCase(calculo.getTipo())) {
                if (calculo.getResposta() == nFatorial / fatorial(n - p)){
                    resposta = nFatorial / fatorial(n - p );
                    return new Response(resposta,true);
                } else{
                    resposta = nFatorial / fatorial(n - p );
                    return new Response(resposta,false);
                }
            }

        }
    return new Response(0,false);
    }
    public static int fatorial(int n ){
        int resultado = 1;
        for(int i = 2; i <= n ; i++){
            resultado*= i;
        }
        return resultado;
    }
}
