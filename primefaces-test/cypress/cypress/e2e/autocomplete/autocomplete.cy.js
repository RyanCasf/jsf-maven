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
  cy.get('#form\\:campo').as('campo-campo');
  cy.get('@campo-campo')
    .should('be.visible')
    .should('have.text', 'Opção:')
  
  cy.get('#form\\:textoAutoComplete').as('texto-autoComplete');
  cy.get('@texto-autoComplete')
    .should('be.visible')
    .type('Teste', { delay:0 })
}