Feature: Probar opciones de menu en la pagina


@A1
  Scenario: Verificar que las opciones seleccionadas funcionen
    Given Navego a la pagina principal
    When El usuario navega a  las tres primeras opciones del menu
    Then Las paginas de cada una de las opciones se despliegan

@A2    
    Scenario: Verificar la opciones en la opcion de Accordion
    Given Navego a la pagina principal
    When Usuario navega a la seccion Accordion
    Then Usuario verifica que se desplego la pagina de Accordion