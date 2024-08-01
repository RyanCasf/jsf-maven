describe('AutoComplete', () => {
  
  beforeEach(() => {
    cy.visit('autocomplete.jsf')
  })

  it('Página ao abrir.', () => {
    cy.title().should('be.equal', 'AutoComplete')
    init()
  })
})

function init() {
  cy.get('#formulario\\:opcao')
      .should('be.visible')
      .should('have.text', 'Opção:')
  
  cy.get('#formulario\\:textoAutoComplete')
    .should('be.visible')
    .type('Teste{enter}', { delay:0 })
}