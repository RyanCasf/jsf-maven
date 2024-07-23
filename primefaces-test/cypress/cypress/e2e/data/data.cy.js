describe('Data', () => {

    beforeEach(() => {
        cy.visit('data.jsf')
    })

    it('Página ao abrir.', () => {
        cy.title().should('be.equals', 'Data')
        init()
    })
})

function init() {
    cy.get('#formularioData\\:informacao')
        .should('not.visible')

    cy.get('#formularioData\\:texto_data')
        .should('have.text', 'Data:')
        .should('have.css', 'font-weight', '700')
        .should('have.css', 'display', 'block')

    cy.get('#formularioData\\:data')
        .should('be.visible')

    cy.get('#formularioData\\:dataTexto')
        .should('be.empty')
        .should('have.css', 'font-weight', '700')

    cy.get('#formularioData\\:imprimir')
        .should('have.text', 'Imprimir')
        .should('have.css', 'display', 'block')
}